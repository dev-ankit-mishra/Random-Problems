//Problem-Link-https://leetcode.com/problems/plus-one/

class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (digits[n - 1] == 9) {
            if (n == 1) {
                int[] list = new int[2];
                list[0] = 1;
                list[1] = 0;
                return list;
            }
            int idx = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    idx = i;
                } else {
                    break;
                }
            }
            if (idx != 0) {
                int[] arr = new int[n];
                for (int i = 0; i < idx - 1; i++) {
                    arr[i] = digits[i];
                }
                for (int i = idx - 1; i < n; i++) {
                    if (i == idx - 1) {
                        arr[i] = digits[i] + 1;
                    } else {
                        arr[i] = 0;
                    }
                }
                return arr;
            } else {
                int[] arr = new int[n + 1];
                for (int i = 0; i < idx; i++) {
                    arr[i] = digits[i];
                }
                for (int i = idx; i < n + 1; i++) {
                    if (i == idx) {
                        arr[i] = 1;
                    } else {
                        arr[i] = 0;
                    }
                }
                return arr;
            }

        } else {
            int[] arr = new int[n];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = digits[i];
            }
            arr[n - 1] = digits[n - 1] + 1;
            return arr;
        }
    }
}