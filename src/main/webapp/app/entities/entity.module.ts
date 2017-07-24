import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { SpringbootJhipsterRegionMySuffixModule } from './region/region-my-suffix.module';
import { SpringbootJhipsterCountryMySuffixModule } from './country/country-my-suffix.module';
import { SpringbootJhipsterLocationMySuffixModule } from './location/location-my-suffix.module';
import { SpringbootJhipsterDepartmentMySuffixModule } from './department/department-my-suffix.module';
import { SpringbootJhipsterTaskMySuffixModule } from './task/task-my-suffix.module';
import { SpringbootJhipsterEmployeeMySuffixModule } from './employee/employee-my-suffix.module';
import { SpringbootJhipsterJobMySuffixModule } from './job/job-my-suffix.module';
import { SpringbootJhipsterJobHistoryMySuffixModule } from './job-history/job-history-my-suffix.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        SpringbootJhipsterRegionMySuffixModule,
        SpringbootJhipsterCountryMySuffixModule,
        SpringbootJhipsterLocationMySuffixModule,
        SpringbootJhipsterDepartmentMySuffixModule,
        SpringbootJhipsterTaskMySuffixModule,
        SpringbootJhipsterEmployeeMySuffixModule,
        SpringbootJhipsterJobMySuffixModule,
        SpringbootJhipsterJobHistoryMySuffixModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SpringbootJhipsterEntityModule {}
