# 💄 Sales-Scraper

This is a simple Java application that scrapes product data from [arzumbeauty.com](https://arzumbeauty.com/), including product names, links, and both previous and current prices. The goal is to monitor discounts automatically and build a more advanced analysis tool for beauty stores in the future.

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Jsoup (for HTML parsing)
- Spring Scheduler (`@Scheduled`) for automation

## ⚙️ Features

- Connects to the homepage using Jsoup
- Extracts product names and links
- Navigates to each product page to retrieve:
  - Product name
  - Previous and current prices
  - Product description
- Outputs all the information to the console

## 📌 Disclaimer

This project is intended **for educational and testing purposes only**. The scraping functionality is not designed for long-term use without the permission of the website owner.

Currently, requests are sent every **1 second** (`@Scheduled(fixedDelay = 1000)`). In real-world usage, the delay should be increased to avoid overloading the server.

## 📂 How to Run

```bash
git clone https://github.com/nuray888/Sales-Scraper.git
cd Sales-Scraper
./mvnw spring-boot:run
