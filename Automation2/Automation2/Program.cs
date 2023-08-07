namespace Automation2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string fullName = "Robert George Augustin";
            string[] nameArray = fullName.Split(',');

            if (nameArray.Length >= 2)
            {
                string name = "";

                for (int i = 0; i < nameArray.Length - 2; i++)
                {
                    string namepart = nameArray[i];
                    name = name + namepart[0] + ".";
                }

                name = name + nameArray[nameArray.Length - 1];
                Console.WriteLine("hi");


            }
        }
    }
}
