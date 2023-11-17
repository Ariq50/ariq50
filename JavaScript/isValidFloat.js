function isValidFloat(x)
            {
                var regex = /^\d+\.\d{4,}$/;
                return regex.test (x);
            }
