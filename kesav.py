def is_valid(x, y, m, n):
    return 0 <= x < m and 0 <= y < n

def dfs(matrix, x, y, prev_char, memo):
    # Check boundaries and if the character is the next consecutive one
    if not is_valid(x, y, len(matrix), len(matrix[0])) or ord(matrix[x][y]) != ord(prev_char) + 1:
        return 0
    
    # If we already computed this subproblem, return the stored result
    if memo[x][y] != -1:
        return memo[x][y]

    # Explore all 8 possible directions
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1), (-1, -1), (-1, 1), (1, -1), (1, 1)]
    max_length = 0
    for dx, dy in directions:
        new_x, new_y = x + dx, y + dy
        max_length = max(max_length, 1 + dfs(matrix, new_x, new_y, matrix[x][y], memo))
    
    # Store the result in the memoization table
    memo[x][y] = max_length
    return memo[x][y]

def find_longest_consecutive_path(matrix):
    if not matrix or not matrix[0]:
        return 0
    
    m, n = len(matrix), len(matrix[0])
    memo = [[-1 for _ in range(n)] for _ in range(m)]
    max_path_length = 0

    # Start DFS from each cell
    for i in range(m):
        for j in range(n):
            for x in range(m):
                for y in range(n):
                    if matrix[x][y] == matrix[i][j]:
                        max_path_length = max(max_path_length, dfs(matrix, x, y, chr(ord(matrix[x][y])-1), memo))
                        
    return max_path_length

# Example usage:
matrix = [
    ['D', 'E', 'H', 'X', 'B'],
    ['A', 'O', 'G', 'P', 'E'],
    ['D', 'D', 'C', 'F', 'D'],
    ['E', 'B', 'E', 'A', 'S'],
    ['C', 'D', 'Y', 'E', 'N']
]

print("The length of the longest path is:", find_longest_consecutive_path(matrix))