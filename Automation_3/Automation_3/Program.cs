using System.Threading.Channels;

namespace Automation_3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string S = "Great Flexibility";
            int count = 1;
            int i = 0;

            Char[] charS = S.ToCharArray();

            for (i = 0; i < charS.Length; i++)
            {
                for (int j = 0; j < charS.Length; j++)
                {
                    if (charS[i] == charS[j] && charS[j]!= ' ')
                    {
                       count=count+1;
                        charS[j] = ' ';
                    }
                }

                Console.WriteLine(charS[i] + " = " + count);
                count = 0;

            }
            Console.ReadLine();

        }
    }
}