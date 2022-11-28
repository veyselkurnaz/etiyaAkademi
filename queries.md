# 28/11/2022 Queries Ödevi

>- **<h3>ADD</h3> --Müşteri tablosuna müşteri eklemek**
```
insert into customers(id,email,phone,name,costumer_id,birthday,gender)
values(8,'fatma@gmail','5458463233','Fatma',8,'1999-06-06','female')
 
```
#### Kod Çıktısı :

<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img1.PNG"></img>


-----------------------------------------------------------------------------------------------------------------

>- **<h3>UPDATE</h3> --Tedarikci tablosundaki belirli tedarikcinin bilgilerini güncellemek**
```
update suppliers
set name = 'Tarık', phone = '222222'
where id =4
 
```

#### Kod Çıktısı :

<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img2.PNG"></img>

-----------------------------------------------------------------------------------------------------------------

>- **<h3>DELETE</h3> Customer tablosundan belirli bir kişiyi silmek**
```
delete from customers
where id11
 
```

#### Kod Çıktısı :


<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img3.PNG"></img>

---------------------------------------------------------------------------------------------------------------

>- **<h3>INNER JOIN</h3> Aynı kategorideki ürünlerden fiyatı en yüksek olanı getiren sorgu**

```
select MAX(p.price), ca.name from products p
INNER JOIN products_categories pc 
on p.product_id=pc.product_id
INNER JOIN categories ca
on pc.category_id=ca.category_id
GROUP BY ca.category_id
 
```

#### Kod Çıktısı :

<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img4.PNG"></img>


---------------------------------------------------------------------------------------------------------------

>- **<h3>RIGHT JOIN</h3> Ürün ve kategori tablolarını birleştiren sorgu**

```
select * from products p 
left join products_categories pc
on p.product_id=pc.product_id
right join categories c
on c.category_id=pc.category_id
 
```

#### Kod Çıktısı :

<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img5.PNG"></img>


---------------------------------------------------------------------------------------------------------------


>- **<h3>LEFT JOIN</h3>**

```
select * from products p 
left join products_categories pc
on p.product_id=pc.product_id
inner join categories c
on c.category_id=pc.category_id
 
```
#### Kod Çıktısı :


<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img6.PNG"></img>


---------------------------------------------------------------------------------------------------------------


>- **<h3>FULL OUTER JOIN</h3>**
```
select * from products p 
full join products_categories pc
on p.product_id=pc.product_id
full join categories c
on c.category_id=pc.category_id
 
```
#### Kod Çıktısı :

<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img7.PNG"></img>

---------------------------------------------------------------------------------------------------------------



>- **<h3>IN</h3>**

```
select * from users u
where name in ('kaya','mert')
 
```

#### Kod Çıktısı :

<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img8.PNG"></img>

---------------------------------------------------------------------------------------------------------------


>- **<h3>GROUP BY AND HAVING</h3>Stok adedi 20'den fazla olan ürünleri isme göre gruplayıp listeleyen sorgu**

```
select p.name as "Urun Adı", p.stock as "Ürün stok sayısı" from products p 
inner join suppliers s 
on p.supplierid = s.supplierid
group by p.name, p.stock
having p.stock>20
 
```

#### Kod Çıktısı :

<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img9.PNG"></img>

---------------------------------------------------------------------------------------------------------------

>- **<h3>BETWEEN</h3> Stok adedi 10 ile 50 arasında olan ürünleri listeleyen sorgu**

```
select p.name as "Urun Adı", p.stock as "Ürün stok sayısı" from products p 
group by p.name, p.stock
having p.stock
between 10 and 50
 
```

#### Kod Çıktısı :

<img src="https://raw.githubusercontent.com/veyselkurnaz/etiyaAkademi/master/img/img10.PNG"></img>


---------------------------------------------------------------------------------------------------------------
