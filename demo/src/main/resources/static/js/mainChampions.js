// Get the input element
var input = document.getElementById("myInput");

// Add an event listener to listen for changes in the input
input.addEventListener("input", function () {
    // Get the value of the input
    var filter = input.value.toLowerCase();

    // Get all the list items
    var items = document.getElementsByClassName("champion-name");

    // Loop through the items and hide those that don't match the filter
    for (var i = 0; i < items.length; i++) {
        var item = items[i];
        var text = item.textContent || item.innerText;
        if (text.toLowerCase().indexOf(filter) > -1) {
            item.parentElement.style.display = "";
        } else {
            item.parentElement.style.display = "none";
        }
    }
});
