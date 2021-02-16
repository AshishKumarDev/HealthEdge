# HealthEdge

The solution is based on constraint that one can only move down or left. So in order to reach position in matrix[1][1] , it would have come either from 0,1 or 1,0. 
Taking the max of both and setting matrix[i][j] to the max of sum of either matrix[i-1][j] or matrix[i][j-1]. By the time it reaches matrix[r][c]
(r=number of rows, c=number of column), it would have max sum.
