function goToNewPage(myForm)
        {
            var mydest = myForm.destList.options[myForm.destList.selectedIndex].value;
            window.open(mydest, '_blank');        
        }
