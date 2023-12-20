function loadDoc() {
      const xhttp = new XMLHttpRequest();
      xhttp.onload = function () {
        myFunction(this);
      };
      xhttp.open("GET", "cd_catalog.xml");
      xhttp.send();
    }
