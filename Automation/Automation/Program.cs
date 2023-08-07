namespace Automation
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random random = new Random();
            int randomNumber = random.Next(1, 101);
            int x = randomNumber;
            

            for (int i=1; i <= 50; i++)
            {
                Console.WriteLine("\nEnter number");
                int input = Convert.ToInt32(Console.ReadLine()); 
                
                if (input > x)
                {
                    Console.WriteLine("Number is larger than the secret number");
                }
                else if (input < x)
                {
                    Console.WriteLine("Number is smaller than the secret number");
                }
                else
                {
                    Console.WriteLine("you guesssed it! The number was " + x);
                }
            }

            
            
           
        }
    }
}