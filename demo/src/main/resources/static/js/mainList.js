var input = document.getElementById("myInput");

input.addEventListener("input", function () {
    var filter = input.value.toLowerCase();
    var items = document.getElementsByClassName("item-name");
    var champions = document.getElementsByClassName("champion-name");

    for (var i = 0; i < items.length; i++) {
        var item = items[i];
        var text = item.textContent || item.innerText;
        if (text.toLowerCase().indexOf(filter) > -1) {
            item.parentElement.style.display = "";
        } else {
            item.parentElement.style.display = "none";
        }
    }

    for (var i = 0; i < champions.length; i++) {
        var champion = champions[i];
        var text = champion.textContent || champion.innerText;
        if (text.toLowerCase().indexOf(filter) > -1) {
            champion.parentElement.style.display = "";
        } else {
            champion.parentElement.style.display = "none";
        }
    }
});

var itemNames = document.getElementsByClassName("item-name");
for (var i = 0; i < itemNames.length; i++) {
    itemNames[i].addEventListener("click", function () {
        var itemName = this.textContent || this.innerText;
        var itemUrl = '/items/' + itemName;
        window.location.href = itemUrl;
    });
}

var championNames = document.getElementsByClassName("champion-name");
for (var i = 0; i < championNames.length; i++) {
    championNames[i].addEventListener("click", function () {
        var championName = this.textContent || this.innerText;
        var championUrl = '/champions/' + championName;
        window.location.href = championUrl;
    });
}

function cropImage(sourceImage, x, y, width, height) {
    var canvas = document.createElement('canvas');
    canvas.width = width;
    canvas.height = height;

    var ctx = canvas.getContext('2d');
    ctx.drawImage(sourceImage, x, y, width, height, 0, 0, width, height);

    var croppedImage = new Image();
    croppedImage.src = canvas.toDataURL('image/png');

    return croppedImage;
}

document.addEventListener('DOMContentLoaded', function () {
    var originalImage = document.getElementById('originalImage');
    var x = /*[[${championImage.x}]]*/ 0; // Replace with your Thymeleaf variable
    var y = /*[[${championImage.y}]]*/ 0; // Replace with your Thymeleaf variable
    var width = /*[[${championImage.width}]]*/ 48; // Replace with your Thymeleaf variable
    var height = /*[[${championImage.height}]]*/ 48; // Replace with your Thymeleaf variable

    originalImage.crossOrigin = 'anonymous';
    originalImage.onload = function() {
        // Crop the image
        var croppedImage = cropImage(this, x, y, width, height);

        // Hide the original image
        originalImage.style.display = 'none';

        // Display the cropped image
        var croppedImageContainer = document.getElementById('croppedImageContainer');
        croppedImageContainer.appendChild(croppedImage);
    };
});

<!-- funkcja do przycinania zdj-->
<!--    <script th:inline="javascript">-->
<!--        function cropImage(sourceImage, x, y, width, height) {-->
<!--            var canvas = document.createElement('canvas');-->
<!--            canvas.width = width;-->
<!--            canvas.height = height;-->

<!--            var ctx = canvas.getContext('2d');-->
<!--            ctx.drawImage(sourceImage, x, y, width, height, 0, 0, width, height);-->

<!--            var croppedImage = new Image();-->
<!--            croppedImage.src = canvas.toDataURL('image/png');-->

<!--            return croppedImage;-->
<!--        }-->

<!--        var originalImage = document.getElementById('originalImage');-->
<!--        var x = [[${championImage.x}]];-->
<!--        var y = [[${championImage.y}]];-->
<!--        var width = [[${championImage.w}]];-->
<!--        var height = [[${championImage.h}]];-->

<!--        originalImage.crossOrigin = 'anonymous';-->
<!--        originalImage.onload = function() {-->
<!--            var croppedImage = cropImage(this, x, y, width, height);-->
<!--            var croppedImageContainer = document.getElementById('croppedImageContainer');-->
<!--            croppedImageContainer.appendChild(croppedImage);-->
<!--        };-->
