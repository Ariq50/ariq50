// Define a global variable to store the map instance
        var map;

        // Define a function to initialize the map
        function loadMap() {
            // Create a map instance with the specified options
            map = new Microsoft.Maps.Map('#map', {
                // Set the center location and zoom level of the map
                center: new Microsoft.Maps.Location(37.3382, -121.8863),
                zoom: 12,
                // Set the map style to road
                mapTypeId: Microsoft.Maps.MapTypeId.road
            });

            // Add a traffic layer to the map
            var trafficLayer = new Microsoft.Maps.Traffic.TrafficLayer(map);
            trafficLayer.show();
        }
