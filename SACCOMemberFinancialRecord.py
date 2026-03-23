# sacco.py
member_name = input("Enter member name: ")
member_id = input("Enter member ID: ")

contributions = []

for i in range(6):
    amount = float(input(f"Enter contribution for month {i+1}: "))
    contributions.append(amount)

total_savings = sum(contributions)
print(f"Total savings for {member_name} ({member_id}): {total_savings} KES")