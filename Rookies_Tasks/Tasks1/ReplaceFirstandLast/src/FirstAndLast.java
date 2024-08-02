class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int[2];
            result[0] = findFirstPosition(nums, target);
            result[1] = findLastPosition(nums, target);
            return result;
        }

        private static int findFirstPosition(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int position = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    position = mid;
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return position;
        }

        private static int findLastPosition(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int position = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    position = mid;
                    left = mid + 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return position;
        }
    }

