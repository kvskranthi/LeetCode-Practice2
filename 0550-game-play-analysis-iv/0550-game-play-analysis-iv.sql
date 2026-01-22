select round(Count(player_id)/(select count(distinct player_id)from Activity),2)fraction from
(select player_id,event_date,min(event_date)over (partition by player_id)first_date from Activity)as x
where datediff(event_date,first_date)=1