inputCelsius = prompt("Enter temperature in Celsius");
let Celsius = parseFloat(inputCelsius);
Fahrenheit = (Celsius * 9/5) + 32;
document.write('Độ Fahrenheit là: ' + Fahrenheit.toFixed(2));