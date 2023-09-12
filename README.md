
# Fibonacci API

This project is a technical test, it consists of an API to obtain Fibonacci sequences for a specified index.

## Technical Decisions

Matrix-Based Approach

In this Fibonacci API, I've chosen to implement a matrix-based approach to calculate Fibonacci numbers. I made this decision based on the following considerations:

Efficiency: The matrix exponentiation method allows me to calculate Fibonacci numbers in logarithmic time complexity O(log(n)) as opposed to the naive sequential approach, which has linear time complexity O(n). This makes it highly efficient, especially for large Fibonacci numbers.

Scalability: The matrix-based approach scales well even for very large Fibonacci numbers, making it suitable for a wide range of use cases.

Optimization: By using matrix exponentiation, I can calculate Fibonacci numbers with a significantly reduced number of operations compared to the sequential method.

## Potential Future Optimizations

While the current implementation is efficient, there are some potential optimizations I could explore in the future:

Memorization: If I anticipate frequent calculations of Fibonacci numbers with the same inputs, we could implement memorization (caching) to store previously computed results. This would further reduce the number of operations, improving performance.

Parallelization: For very large Fibonacci numbers, I could explore parallelization techniques to distribute the workload across multiple processors or threads, potentially speeding up calculations.

Optimized Matrix Multiplication: I could optimize the matrix multiplication step, which is a key component of the matrix-based approach, by using techniques like Strassen's algorithm for matrix multiplication to reduce the number of arithmetic operations.
