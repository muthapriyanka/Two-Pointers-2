//time complexity: O(n)
//space complexity:O(1)
public class RemoveDuplicatedSorted {
        public int removeDuplicates(int[] nums)
        {
            if(nums.length==0 || nums==null)
            {
                return 0;
            }
            int j=1;
            int count=1;

            for(int i=1;i<nums.length; i++)
            {
                if(nums[i]==nums[i-1])
                {
                    count++;
                }
                else
                {
                    count=1;
                }
                if(count<=2)
                {
                    nums[j]=nums[i];
                    j++;
                }
            }
            return j;
        }
        public static void main(String[] args)
        {
            RemoveDuplicatedSorted r= new RemoveDuplicatedSorted();
            System.out.println(r.removeDuplicates(new int[] {1,1,1,2,2,3}));
        }
    }

