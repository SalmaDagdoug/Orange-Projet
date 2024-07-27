#Author: Salma
Feature: Consultation des menus de la home page

  Scenario Outline: Acceder aux pages de chaue menu
    Given utilisateur est connecté avec le bon username "Admin" et le bon password "admin123"
    When utilisateur clique sur le "<menu>"
    Then la page de menu est affichée qui contient le nom de "<menu>"

    Examples: 
      | menu        |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Claim       |
      | Buzz        |
