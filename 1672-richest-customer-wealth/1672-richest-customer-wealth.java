class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_networth = 0;

        for(int i = 0; i < accounts.length; i++){
            int networth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                networth += accounts[i][j];
            }
            if(networth > max_networth){ 
                max_networth = networth;
            }
        }
        return max_networth;
    }
}