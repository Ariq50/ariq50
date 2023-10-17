//Looping with for statement
        let product1 = 1;
        let sum1 = 0;
        for(let i = 5; i <= 25; i += 4) 
        {
            product1 *= i;
            sum1 += i;
        }
        document.getElementById("product1").textContent = product1.toLocaleString();
        document.getElementById("sum1").textContent = sum1.toLocaleString();

        //Looping with while statement
        let product2 = 1;
        let sum2 = 0;
        let j = 3;
        while(j <= 18)
        {
            product2 *= j;
            sum2 += j;
            j += 3;
        }
        document.getElementById("product2").textContent = product2.toLocaleString();
        document.getElementById("sum2").textContent = sum2.toLocaleString();
