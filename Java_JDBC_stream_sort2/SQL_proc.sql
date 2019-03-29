 create proc InsertDrzava
@naziv nvarchar(50)
as
    declare @count int

    select @count = count(*) from tblDrzava d where d.NazivHrKratki = @naziv

    if @count > 0	throw 50000, 'Država veæ postoji', 1;
insert into tblDrzava(NazivHrKratki, NazivHrPuni, NazivEnKratki, NazivEnPuni) values(@naziv, '', '', '')