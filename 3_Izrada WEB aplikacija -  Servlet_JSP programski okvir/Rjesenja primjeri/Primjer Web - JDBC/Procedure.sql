create proc KupciZaDrzavu
	@drzavaId int
as
select top 50 k.IDKupac, k.Ime, k.Prezime, k.Email, g.Naziv as 'Grad', d.Naziv as 'Drzava'
from Kupac k
inner join Grad g on k.GradID = g.IDGrad
inner join Drzava d on g.DrzavaID = d.IDDrzava
where d.IDDrzava = @drzavaId
order by k.IDKupac
go

create proc DodajNovuDrzavu
 @naziv nvarchar(50),
 @noviId int out
 as
 insert into Drzava(Naziv) values(@naziv)
 set @noviId = SCOPE_IDENTITY()
 go

 create proc UpdateKupac
	@ime nvarchar(50),
	@prezime nvarchar(50),
	@id int,
	@email nvarchar(50)
as
update Kupac set Ime = @ime, Prezime = @prezime, Email = @email where IDKupac = @id
go

create proc Kupci as select * from Kupac
go
create proc Gradovi as select * from Grad
go
create proc Drzave as select * from Drzava
go


