package com.jjbae.app.robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotMain {
    public static void main(String[] args) {
        // 웹 드라이버 경로 설정
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        
        // 웹 드라이버 초기화
        WebDriver driver = new ChromeDriver();
        
        // 구글 검색 페이지 열기
        driver.get("https://www.google.com");
        
        // 검색어 입력
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("배재준");
        searchBox.submit();
        
        // 결과 페이지에서 첫 번째 링크 클릭
        WebElement firstLink = driver.findElement(By.cssSelector("div#search div.g:nth-of-type(1) a"));
        firstLink.click();
        
        // 웹 드라이버 종료
        driver.quit();
    }
}
