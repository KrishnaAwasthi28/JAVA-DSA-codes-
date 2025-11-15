//Floyd Warshall Algorithm 


public class FloydWarshall {
    public static int[][] floydWarshall(int[][] dist) {
        // Change -1 to Infinity (according to the given constraint which will be the
        // unreacheble value)
        int n = dist.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == -1)
                    dist[i][j] = 1001;
            }
        }
        //Iteration of Floyd Warshall Algorithm
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == -1)
                    dist[i][j] = 1001;
            }
        }
        return dist;
    }
}
