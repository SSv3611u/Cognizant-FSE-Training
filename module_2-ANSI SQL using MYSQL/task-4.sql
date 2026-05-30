select e.event_id,count(session_id) as total_sessions 
from events e 
join sessions s on e.event_id = s.event_id
where TIME(s.start_time) between '10:00:00' and '12:00:00'
group by e.event_id;