using CSharpPartTwo._010exampleunittest;
using System;
using Xunit;

namespace XUnitTestProjectXUnit
{
    public class UnitTest1
    {
        [Fact]
        public void Test1()
        {
            // AAA

            // Arrange

            Employee alex = new Employee(1);

            // Act
            decimal result = alex.CalculateTotalPay(100000, 20000);

            // Assert
            Assert.Equal(120000, result);
        }

        [Fact]
        public void Test5()
        {
            // AAA
            // Arrange
            var exception = Record.Exception(() =>
            {
                Employee alex = new Employee(0);
            });

            Assert.IsType<ArgumentException>(exception);
        }

        //[Fact]
        [Theory]
        [InlineData(1, 2, 3)]
        [InlineData(-4, -6, -10)]
        [InlineData(-2, 2, 0)]
        public void Test2(decimal salary, decimal bonus, decimal expected)
        {
            // AAA

            // Arrange

            Employee alex = new Employee(1);

            // Act
            decimal result = alex.CalculateTotalPay(salary, bonus);

            // Assert
            Assert.Equal(expected, result);
        }
    }
}
