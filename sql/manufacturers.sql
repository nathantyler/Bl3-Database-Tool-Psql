BEGIN TRANSACTION;
CREATE TABLE bl3_manufacturer (
   manufacturer_id serial PRIMARY KEY,
   manufacturer_name VARCHAR(50) NOT NULL,
   is_pistol_maker BOOLEAN NOT NULL,
   is_smg_maker BOOLEAN NOT NULL,
   is_sniper_maker BOOLEAN NOT NULL,
   is_ar_maker BOOLEAN NOT NULL,
   is_shotgun_maker BOOLEAN NOT NULL,
   is_rl_maker BOOLEAN NOT NULL,
   is_shield_maker BOOLEAN NOT NULL,
   is_grenade_maker BOOLEAN NOT NULL
);

INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker) 
                              VALUES ('Atlas', true, false, 
                                      false, true, false, 
                                      true, false, true);

INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker) 
                              VALUES ('COV', true, false, 
                                      false, true, false, 
                                      true, false, false);

INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker) 
                              VALUES ('Dahl', true, true, 
                                      true, true, false, 
                                      false, false, false);
                                      
INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker) 
                              VALUES ('Hyperion', false, true, 
                                      true, false, true, 
                                      false, true, true);                                                                            

INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker) 
                              VALUES ('Jakobs', true, false, 
                                      true, true, true, 
                                      false, false, false);
                                      
INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker) 
                              VALUES ('Maliwan', true, true, 
                                      true, false, true,
                                      false, false, false); 

INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker) 
                              VALUES ('Tediore', true, true, 
                                      false, false, true, 
                                      false, false, true);

INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker) 
                              VALUES ('Torgue', true, false, 
                                      false, true, true, 
                                      true, false, true);

INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker)
                              VALUES ('Vladof', true, false, 
                                      true, true, false, 
                                      true, false, true);
                                      
INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker)
                              VALUES ('Anshin', false, false, 
                                      false, false, false, 
                                      false, true, false);

INSERT INTO bl3_manufacturer (manufacturer_name, is_pistol_maker, is_smg_maker, 
                              is_sniper_maker, is_ar_maker, is_shotgun_maker, 
                              is_rl_maker, is_shield_maker, is_grenade_maker)
                              VALUES ('Pangolin', false, false, 
                                      false, false, false, 
                                      false, true, true);                                      
END TRANSACTION;