using System;

namespace Factorial
{
    class Program
    {
        static void Main(string[] args)
        {
            int input = int.Parse(Console.ReadLine());
            Console.WriteLine(Factorial(input));
        }
        static int Factorial(int n)
        {
            int output;
            if (n==1){
                return 1;
            }
            else
            {
                output = n * Factorial(n - 1);
                return output;
            }          
        }
    }
}
