# Business Hierarchy

This is an implementation of class hierarchy representing individuals involved in a business.

A business might have executives, full time salaried employees, full time hourly employees, part time hourly employees, hourly paid contractors, 
as well as customers/clients. Each individual might have such attributes as first name, last name, age, social security number, address, level of education, 
payment method preference, direct deposit or not, id number (could be customer number or employee number), hourly pay, overtime pay, yearly salary, yearly bonus.

User can add, change, and return an employee/customer information. All the functions have been implemented to fit the use of this business requirement. 
This is an example of what you will get:

```
=====Executive=====
First name: Maria
Last name: Tyler
Age: 34
SSN: 469-10-1826
Address: 721 Laurel Lee Eagan 55121 MN
ID: 38293737
Education Level: N/A
Direct deposit: false
Yearly bonus: $1299900.0
Yearly compensation: $2000000.0
Total pay: $3299900

=====Customer=====
First name: Alex
Last name: Damiens
Age: 62
Address: 3889 Jerry Dove Drive Charleston 29414 SC
ID: 84738374
Pay preference: Paypal
```

A sample code on how to use is in **BusinessTest.java**.
