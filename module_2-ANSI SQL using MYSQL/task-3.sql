select * from users u
where not exists (
	select 1 from registrations r
    where r.user_id = u.user_id
    and r.registration_date >= curdate() - interval 90 day
);