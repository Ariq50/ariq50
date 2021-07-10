using System;
using System.Collections.Generic;
using System.Text;

namespace MOQTesting.BusinessLogic
{
    public interface INotify
    {
        bool SendMessage();

        string SendMessage(string empName);

        int SendMessage(int empId);

        string SendMessage(int empId, string empName);

        void SendMessage(Employee emp);

        bool SendMessage(List<Employee> emps);
    }
}
