package com.betterplace.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class ReusableMethods {

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static boolean areElementsOverlapping(WebElement element1, WebElement element2) {
        Rectangle r1 = element1.getRect();
        Point topRight1 = r1.getPoint().moveBy(r1.getWidth(), 0);
        Point bottomLeft1 = r1.getPoint().moveBy(0, r1.getHeight());

        Rectangle r2 = element2.getRect();
        Point topRight2 = r2.getPoint().moveBy(r2.getWidth(), 0);
        Point bottomLeft2 = r2.getPoint().moveBy(0, r2.getHeight());

        if (topRight1.getY() > bottomLeft2.getY()
                || bottomLeft1.getY() < topRight2.getY()) {
            return false;
        }
        if (topRight1.getX() < bottomLeft2.getX()
                || bottomLeft1.getX() > topRight2.getX()) {
            return false;
        }
        return true;
    }

}
