# -*- coding: utf-8 -*-
"""week2_exercise 2_ksattar

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1ow1iY8W3k90NyCMVQlTWRDeYKT3uaoXk
"""

# Define the BankAccount class
class BankAccount:
    # Initialize the bank account with an account number, account holder's name, and initial balance
    def __init__(self, account_number, account_holder, initial_balance):
        self.account_number = account_number
        self.account_holder = account_holder
        self.balance = initial_balance
        self.transactions = [] # A list of transactions associated with this account

    # Deposit funds to the account
    def deposit(self, amount):
        self.balance += amount # Increase the balance by the amount
        transaction = Transaction(amount, "deposit") # Create a new transaction object
        self.transactions.append(transaction) # Add the transaction to the list
        print(f"Deposited ${amount} to {self.account_number}. New balance: ${self.balance}")

    # Withdraw funds from the account
    def withdraw(self, amount):
        if amount > self.balance: # Check if the withdrawal amount exceeds the available balance
            print(f"Insufficient funds. Cannot withdraw ${amount} from {self.account_number}. Current balance: ${self.balance}")
        else:
            self.balance -= amount # Decrease the balance by the amount
            transaction = Transaction(amount, "withdrawal") # Create a new transaction object
            self.transactions.append(transaction) # Add the transaction to the list
            print(f"Withdrew ${amount} from {self.account_number}. New balance: ${self.balance}")

    # Check the account balance
    def check_balance(self):
        print(f"The balance of {self.account_number} is ${self.balance}")

    # Display the account details
    def display_account(self):
        print(f"Account number: {self.account_number}")
        print(f"Account holder: {self.account_holder}")
        print(f"Account balance: ${self.balance}")

# Define the Transaction class
class Transaction:
    # Initialize a transaction with details such as amount, type (deposit or withdrawal), and date
    def __init__(self, amount, transaction_type):
        self.amount = amount
        self.transaction_type = transaction_type
        self.date = datetime.date.today() # Get the current date

    # Display the transaction details
    def display_transaction(self):
        print(f"{self.transaction_type.capitalize()} of ${self.amount} on {self.date}")

# Import the datetime module
import datetime

# Create an instance of the BankAccount class for a user
user_account = BankAccount("123456789", "Alice", 1000)

# Perform multiple transactions (deposits and withdrawals)
user_account.deposit(500)
user_account.withdraw(200)
user_account.withdraw(1000)
user_account.deposit(300)

# Display the account balance after each transaction
user_account.check_balance()

# Display a list of transactions with their details
print("Transaction history:")
for transaction in user_account.transactions:
    transaction.display_transaction()