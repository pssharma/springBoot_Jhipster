import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SpringbootJhipsterSharedModule } from '../../shared';
import {
    LocationMySuffixService,
    LocationMySuffixPopupService,
    LocationMySuffixComponent,
    LocationMySuffixDetailComponent,
    LocationMySuffixDialogComponent,
    LocationMySuffixPopupComponent,
    LocationMySuffixDeletePopupComponent,
    LocationMySuffixDeleteDialogComponent,
    locationRoute,
    locationPopupRoute,
} from './';

const ENTITY_STATES = [
    ...locationRoute,
    ...locationPopupRoute,
];

@NgModule({
    imports: [
        SpringbootJhipsterSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        LocationMySuffixComponent,
        LocationMySuffixDetailComponent,
        LocationMySuffixDialogComponent,
        LocationMySuffixDeleteDialogComponent,
        LocationMySuffixPopupComponent,
        LocationMySuffixDeletePopupComponent,
    ],
    entryComponents: [
        LocationMySuffixComponent,
        LocationMySuffixDialogComponent,
        LocationMySuffixPopupComponent,
        LocationMySuffixDeleteDialogComponent,
        LocationMySuffixDeletePopupComponent,
    ],
    providers: [
        LocationMySuffixService,
        LocationMySuffixPopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SpringbootJhipsterLocationMySuffixModule {}
