# E-Commerce System

## Overview

This is a simple e-commerce system implemented in Java, designed to demonstrate Object-Oriented Programming (OOP) principles, including abstraction, inheritance, and interfaces.

## Features

- Supports two types of products:

  - **Expirable Products** (e.g., Cheese, Biscuits)
  - **Non-Expirable Products** (e.g., TV, Mobile)

- Implements a shopping cart system where:

  - Products can be added to the cart.
  - Expired products and out-of-stock products cannot be added.

- Implements a checkout system where:

  - Order subtotal, shipping fees, and total payment are calculated.
  - Customer's balance is updated after payment.
  - An error is shown if the cart is empty or if the customer has insufficient funds.

- Implements a shipping service for items requiring shipping.

## Classes and Responsibilities

### 1\. Product (Abstract Class)

Represents a general product with attributes such as:

- name (Product name)
- price (Product price per unit)
- quantity (Available stock)
- requiresShipping (Indicates if shipping is needed)
- weight (Weight of the product, used for shipping)
- expired (Indicates if the product is expired)

### 2\. ExpirableProduct (Subclass of Product)

- Extends Product to include an expiryDays attribute.
- Implements ShippingItem interface for products that require shipping.

### 3\. NonExpirableProduct (Subclass of Product)

- Represents products that do not expire.
- Implements ShippingItem for products requiring shipping.

### 4\. ShippingItem (Interface)

- Defines methods for products that require shipping:

  - getName() - Returns product name.
  - getWeight() - Returns product weight.

### 5\. Cart

- Maintains a list of products and quantities.
- Provides methods to:

  - Add products to the cart.
  - Calculate order subtotal.
  - Calculate shipping fees.
  - Get the total amount due.
  - Validate cart status (empty or valid checkout).

### 6\. Customer

- Represents a customer with attributes:

  - balance (Available funds for shopping)
  - cart (Shopping cart instance)

### 7\. Order

- Handles the checkout process:

  - Ensures cart is not empty.
  - Checks if the customer has sufficient balance.
  - Deducts the amount from the customer's balance.
  - Displays checkout details (subtotal, shipping fees, paid amount, remaining balance).
  - Initiates shipping for applicable products.

### 8\. ShippingService

- Handles shipping for items that require delivery.
- Lists shipped products and their respective weights.

### 9\. ECommerceSystem (Main Class)

- Demonstrates system functionality by:

  - Creating products (expirable and non-expirable).
  - Creating a customer with a balance.
  - Adding products to the customer's cart.
  - Handling checkout and shipping.