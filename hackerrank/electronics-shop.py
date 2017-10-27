import sys

def solve(money, keyboard_prices, usb_drive_prices):
    if money < (min(keyboard_prices) + min(usb_drive_prices)): return -1
    most_money_spent = 0
    for keyboard_price in keyboard_prices:
        for usb_drive_price in usb_drive_prices:
            if keyboard_price + usb_drive_price > money: continue
            most_money_spent = max(most_money_spent, keyboard_price + usb_drive_price)
    return most_money_spent

money, n, m = [int(num) for num in input().strip().split()]
keyboard_prices = [int(num) for num in input().strip().split()]
usb_drive_prices = [int(num) for num in input().strip().split()]
print(solve(money, keyboard_prices, usb_drive_prices))
