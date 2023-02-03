package KJY_랜덤밥;

import java.util.Random;

public class LunchGenerator {
  public static void main(String[] args) {
    String[] restaurants = {"제주도 새매집", "맛집 새매집", "부산 새매집", "부산 새매집 음식점", "새매집 부산 음식점"};

    Random random = new Random();
    int randomIndex = random.nextInt(restaurants.length);

    System.out.println("Today's lunch menu: " + restaurants[randomIndex]);
  }
}