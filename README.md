# 💱 Currency Converter in Java (Static Rates)

A **console-based Currency Converter** built using **Java** with a clean **OOP design**.  
This beginner-friendly project supports **multiple currencies**, uses **enum for currency codes**, and allows **repeated conversions using loops**.

Ideal for Java beginners, college mini-projects, and OOP practice.

---

## 🚀 Features

✔ Supports multiple currencies  
✔ Uses `enum` for currency codes  
✔ Static exchange rates (base: INR)  
✔ Loop-based multiple conversions  
✔ Input validation with exception handling  
✔ Clean and readable OOP-style code  

---

## 💱 Supported Currencies (Static Rates)

- **INR** – Indian Rupee (Base)
- **USD** – US Dollar
- **EUR** – Euro
- **GBP** – British Pound
- **JPY** – Japanese Yen
- **AUD** – Australian Dollar
- **CAD** – Canadian Dollar

---

## 🧠 Concepts Used

- `enum`
- `HashMap`
- Static block
- Loops (`do-while`)
- Exception handling
- `Scanner` input
- Method abstraction

---

## 🛠 How It Works

1. User selects **source** and **target** currencies
2. Enters the amount to convert
3. Amount is converted using static INR-based exchange rates
4. User can repeat conversions until exit

---

## ▶️ Sample Output

```
Currency Converter (Static Rates)

Available Currencies:
INR USD EUR GBP JPY AUD CAD

Enter source currency: USD
Enter target currency: JPY
Enter amount: 50
Converted Amount: 7291.67 JPY

Do you want to convert again? (y/n): y
```


---

## 📁 Project Structure

- CurrencyConverter.java


---

## ▶️ How to Run

1. Compile the program:
   ```bash
   javac CurrencyConverter.java

2. Run the program:
    ```bash
    java CurrencyConverter

## 🚀 Further Improvements

1. Store exchange rates in a JSON file

2. Menu-driven UI

3. Swing / JavaFX GUI

4. API-based live exchange rates
