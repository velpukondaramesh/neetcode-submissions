class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
    }

    private void mergeSort(int[] nums, int l, int m){
        if(l>=m) return;
        int mid =(l+m)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,m);
        merge(nums,l,mid,m);
    }

    private void merge(int[] arr, int l, int mid, int m){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = mid+1;

        while(i<=mid && j <= m){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }

        while(j<=m){
            temp.add(arr[j]);
            j++;
        }

        for(i=l;i<=m;i++){
            arr[i] = temp.get(i-l);
        }
    }
}