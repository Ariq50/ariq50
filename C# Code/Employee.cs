using System;
using System.Collections.Generic;
using System.Text;

namespace MOQTesting.BusinessLogic
{
    public class Employee
    {
        public string EmpName { get; set; }

        private INotify notify;

        public Employee(INotify _notify)
        {
            this.notify = _notify;
        }

        public void PayAndNotifyEmployee(Employee emp)
        {
            // some code
            notify.SendMessage(emp);
        }
    }
}
