select e.event_id,
count(case when r.resource_type = 'pdf' then 1 end) as total_pdfs,
count(case when r.resource_type = 'image' then 1 end) as total_images,
count(case when r.resource_type = 'link' then 1 end) as total_links
from events e
left join resources r on e.event_id = r.event_id
group by e.event_id;
