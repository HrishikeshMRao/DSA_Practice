class Solution {
    boolean status = false;
    public boolean gcdSort(int[] arr)
    { 
        sort(arr);
        return(status);
    }
    public static void sort(int[] arr)
    {
        int inputLength = arr.length;
        if(inputLength<2)
        {
            return;
        }
        int midIndex = inputLength/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength-midIndex];

        for(int i=0;i<midIndex;i++)
        {
            leftHalf[i] = arr[i];
        }
        for(int i=midIndex;i<inputLength;i++)
        {
            rightHalf[i-midIndex] = arr[i];
        }

        sort(leftHalf);
        sort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }
    private static void merge (int[] arr, int[] leftHalf, int[] rightHalf)
    {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0,j=0,k=0;

        while((i< leftSize) && (j < rightSize))
        {
            int reminder,divider,divisor; 
            if(leftHalf[i] <= rightHalf[j])
            {
                reminder = rightHalf[j]%leftHalf[i];
                divider=leftHalf[i];
                divisor=rightHalf[j];
                while(reminder!=1)
                { 
                    reminder = divisor%divider;
                    if (reminder == 0) break;
                    divisor = divider;
                    divider = reminder;

                }
                if(reminder == 0)
                {
                    arr[k]=leftHalf[i];
                    i++;
                }
            }
            else
            {
                reminder = leftHalf[i]%rightHalf[j];
                divisor=leftHalf[i];
                divider=rightHalf[j];
                while(reminder!=1)
                { 
                    reminder = divisor%divider;
                    if (reminder == 0) break;
                    divisor = divider;
                    divider = reminder;

                }
                if(reminder == 0)
                {
                    arr[k]=rightHalf[j];
                    j++;
                }
            }
            k++;
        }
        while (i< leftSize)
        {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
         while (j< rightSize)
        {
            arr[k] = rightHalf[i];
            j++;
            k++;
        }
    }
}
