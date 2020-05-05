import java.util.*;
public class MaxHeap
{
	public ArrayList<Integer> insert(ArrayList<Integer> al, int n)
	{
		ArrayList<Integer> ob = new ArrayList<>();
		int k=0;
		while(k<al.size())
		{
			ob.add(al.get(k));
			k++;
		}
		ob.add(n);

		int j=ob.size()-1;
		while(j>=0)
		{
			if(ob.get(j)>ob.get(j/2))
			{
				int temp = ob.get(j/2);
				ob.set(j/2,ob.get(j));
				ob.set(j,temp);
			}
			else
			{
				break;
			}
			j = j/2;
		}

		return ob;
	}

	public ArrayList<Integer> delete(ArrayList<Integer> al)
	{
	   int size = al.size();
       al.set(0,al.get(size-1));
       al.remove(size-1);
       size--;
       int i=0;
       while(Math.pow(2,i)<=size)
       {
       	if(2*i+1>=size&&2*i+2>=size)
       	{
       		break;
       	}
       	if(2*i+1<size&&2*i+2>=size)
       	{
       		if(al.get(i)<al.get(2*i+1))
       		{
       			int temp = al.get(2*i+1);
                al.set(2*i+1,al.get(i));
                al.set(i,temp);
                break;
       		}
       		else
       		{
       			break;
       		}
       	}

       	int maxPos = (al.get(2*i+1)>al.get(2*i+2)?2*i+1:2*i+2);
       	  
       	  if(al.get(i)<al.get(maxPos))
       	  {
            int temp = al.get(maxPos);
            al.set(maxPos,al.get(i));
            al.set(i,temp);
            i = maxPos;
       	  }
       	  else
       	  {
       	  	break;
       	  }
       }
       return al;
	}

	public ArrayList<Integer> heapSort(ArrayList<Integer> al)
	{
		int i = 0;
		int size = al.size();
        ArrayList<Integer> newal = new ArrayList<>();
		while(i<size)
		{
			int temp = al.get(0);
			al = delete(al);
			newal.add(0,temp);
			i++;
		}
		return newal;
	}

	public ArrayList<Integer> create(ArrayList<Integer> al)
	{
       int size = al.size();
       int j=size-1;
       while(j>=0)
		{
			if(al.get(j)>al.get(j/2))
			{
				int temp = al.get(j/2);
				al.set(j/2,al.get(j));
				al.set(j,temp);
			}
			else
			{
				break;
			}
			j = j/2;
		}

		return al;
	}

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		MaxHeap ob = new MaxHeap();
		// al = ob.insert(al,n);
		// System.out.println("inserted MaxHeap");
		// for(int e : al)
		// {
		// 	System.out.print(e+" ");
		// }
		// System.out.println("deleted operation: ");
		// al = ob.delete(al);
		// for(int e : al)
		// {
		// 	System.out.print(e+" ");
		// }
		System.out.println("Enter n: ");
		int n = in.nextInt();
		for(int i=0;i<n;i++)
		{
			int no = in.nextInt();
			if(i == 0)
			{
              al.add(no);
			}
			else
			{
				al.add(no);
				al = ob.create(al);
			}
		}
		System.out.println("created heap: ");
		for(int e : al)
		{
			System.out.print(e+ " ");
		}
		System.out.println();
		System.out.println("sorted heap is ");
        al = ob.heapSort(al);
        for(int e : al)
        {
        	System.out.print(e+ " ");
        }
	}
}