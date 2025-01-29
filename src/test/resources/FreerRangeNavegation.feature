@Navigation
Feature: Navigation bar
  To see the subpages
  without logging in
  I can click the navigation bar links

  Background: I am on the Free Range Tester web without in
    Given I navigate to www.freerangetesters.com

  Scenario Outline: I can access the subpages through the navigation bar
    When I go to  <section> using the navigation bar

    Examples:
      | section   |
      | Cursos    |
      | Recursos  |
      | Blog      |
      | Mentorías |
      | Udemy     |
      | Academia  |


  Scenario: Courses are presented correctly to potential customers
    When I go to  Cursos using the navigation bar
    And select Introducción al Sesting de Software

  @Plans
  Scenario: Users can select a plan when signing up
    When I select Elegir plan
    Then I can validate the oprions in the checkout page
