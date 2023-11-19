// A function to split the phone number into parts
        function splitPhoneNumber() {
            // Get the value of the input box
            var phoneNumber = $("#phone-number").val();
            // Use regex to match the phone number format
            var regex = /^\((\d{3})\) (\d{3})-(\d{4})$/;
            var match = phoneNumber.match(regex);
            // If the phone number matches the format, display the parts in the input boxes
            if (match) {
                $("#area-code").val(match[1]);
                $("#first-three").val(match[2]);
                $("#last-four").val(match[3]);
                // Clear the error message
                $("#error-message").text("");
            } else {
                // If the phone number does not match the format, display an error message
                $("#error-message").text("Please enter the phone number in this format: (999) 999-9999");
                // Clear the input boxes
                $("#area-code").val("");
                $("#first-three").val("");
                $("#last-four").val("");
            }
        }
// When the document is ready, apply the mask to the input box
        $(document).ready(function() {
            $("#phone-number").mask("(999) 999-9999");
        });
