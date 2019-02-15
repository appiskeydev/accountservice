--
-- Dumping data for table `permissaion`
--

INSERT INTO `permission` (`id`, `parent_id`, `name`, `description`) VALUES
-- ======================================== User Module ========================================
-- --------------------------------------- Child Permission -----------------------------------
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', '')), '', 'USER', 'USER MODULE'),
-- --------------------------------------- Child Permission -----------------------------------
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000101', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'CREATE', 'USER MODULE CREATE'),
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000102', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'UPDATE', 'USER MODULE UPDATE'),
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000103', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'DELETE', 'USER MODULE DELETE'),
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000104', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'LIST', 'USER MODULE LIST'),
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000105', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'LOGIN', 'USER MODULE LOGIN'),
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000106', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'REGISTER', 'USER MODULE REGISTER'),
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000107', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'RESET_PASSWORD', 'USER MODULE RESET_PASSWORD'),
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000108', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'RESET_PASSWORD', 'USER MODULE RESET_PASSWORD'),
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000109', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'UPDATE_STATUS', 'USER MODULE UPDATE_STATUS'),
  (unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000110', '-', '')), unhex(replace('a21f6182-0d26-11e9-ab14-d663bd000100', '-', ''))
    , 'UNLOCK_SCREEN', 'USER MODULE UNLOCK_SCREEN');
-- ======================================== User Module ========================================
