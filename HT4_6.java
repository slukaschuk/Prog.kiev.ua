import java.util.Arrays;

/*����� � ������� �����, ������� �����������
���������� ���������� ���. �� ������������
���������.*/
public class HT4_6 {
  	public static void main(String[] args) {
		//int arr[] = {4,4,5,6,5,5,7,10,5,4,5,4,5,5,5,10,45,5,5,5,5,5,5,5,5,4,4,4,4,7};
  		int arr[] = {4,5};
  		int per=0,tmp=0,tmp1=0,per1=0;
  		//�������� � ��������������� ����������
  		Arrays.sort(arr);
  		//����� ���� ����, �� ��� ���� 4 ����������
        for(int i=0;i<arr.length;i++)
        { tmp=arr[i];
          if(i==0){per=1;tmp1=tmp;}
          if (i>0)
          { if(tmp==arr[i-1]){per++;}
           else if(tmp!=arr[i-1])
           {
        	 if (per>per1)
        	 {  
        	 tmp1 = arr[i-1];
        	 per1 = per;
        	 per  = 1;
        	 }
           }
        	  
          }
        }
        System.out.println("Our number = "+ tmp1 +", the number of repetitions = "+(per1==0?per:per1));
        /*
        //���������� ������ � ����� ������� 
         for(int i:arr)
        {
        	tmp=i;per=0;
        	for(int j:arr)
        	{
        		if (tmp==j)
        		{per++;}
        	}
        	if (num<per) {num=per;ournum=tmp;}
        	         	
        }*/
       // System.out.println("Our number = "+ ournum +", the number of repetitions = "+num);
	}

}
