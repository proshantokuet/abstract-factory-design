# abstract-factory-design
Abstract factory design comes under Creational design pattern

## What is abstract factory design pattern

Abstract Factory patterns has a super-factory which creates other factories.
This factory is also called as factory of factories.
Abstract Factory “provides an interface for creating families of related or dependent objects without specifying their concrete classes.


## Advantage
1.User has access to factory that produces items of same family(category)
2.Follow Open-Close-Principle , you can add new factory without affect existing code
3.User has to access single factory than accessing multiple factories for each type of category.

## When to use abstract factory pattern
Do you have a use case where cutomer wants to access multiple types of products 
of same family/category.


##Example:

Pathao rider wants to use offers and payment options and 
Uber rider also wants same thing.
