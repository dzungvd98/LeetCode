class Solution {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
//        int startStation = 0;
//        int n = gas.length;
//        int usedGas = 0;
//        int sumExpense = 0;
//        int count = 0;
//        for(int i = 0; i < n; i++) {
//            int expense = gas[i] - cost[i];
//            sumExpense += expense;
//            usedGas += expense;
//            count++;
//            if(usedGas < 0) {
//                usedGas = 0;
//                count = 0;
//                if(startStation < n-1) {
//                   startStation = i+1;
//                } else startStation = i + 1;
//            }
//            if(i == n - 1 && sumExpense < 0) return -1;
//            if(i == n - 1) i = -1;
//            
//            if(count >= n) break;
//        } 
//        return startStation;

        int n = gas.length;
        int minimalTotal = Integer.MAX_VALUE;
        int minimalIndex = 0;
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += gas[i] - cost[i];
            
            if(total < minimalTotal) {
                minimalIndex = i;
                minimalTotal = total;
            }
        }
        
        if(total < 0) return -1;
        else return (minimalIndex + 1) % n;
    }
    
    public static void main(String args[]) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        
        System.out.println(canCompleteCircuit(gas, cost));
    }
}