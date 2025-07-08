import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();

        // Build a map of rows using their direct tuple representation
        for (int i = 0; i < n; i++) {
            StringBuilder rowKey = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowKey.append(grid[i][j]).append(",");
            }
            rowMap.put(rowKey.toString(), rowMap.getOrDefault(rowKey.toString(), 0) + 1);
        }

        int count = 0;

        // Compare each column against the row map
        for (int j = 0; j < n; j++) {
            StringBuilder colKey = new StringBuilder();
            for (int i = 0; i < n; i++) {
                colKey.append(grid[i][j]).append(",");
            }
            count += rowMap.getOrDefault(colKey.toString(), 0);
        }

        return count;
    }
}
